/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.appland.appmap.record;

import com.appland.appmap.record.EventTemplateRegistry;
import com.appland.appmap.record.UnknownEventException;
import com.appland.appmap.test.util.ClassBuilder;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class EventTemplateRegistryTest {
  private static final EventTemplateRegistry registry = EventTemplateRegistry.get();

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testRegister() throws Exception {
    ArrayList<CtMethod> behaviorsToRegister = new ArrayList<CtMethod>();
    ClassPool classPool = ClassPool.getDefault();
    CtClass classType = classPool.get("com.appland.appmap.ExampleClass");

    behaviorsToRegister.add(classType.getDeclaredMethod("methodStaticZeroParam"));
    behaviorsToRegister.add(classType.getDeclaredMethod("methodStaticSingleParam"));
    behaviorsToRegister.add(classType.getDeclaredMethod("methodZeroParam"));
    behaviorsToRegister.add(classType.getDeclaredMethod("methodOneParam"));

    for (CtMethod method : behaviorsToRegister) {
      registry.register(method);
    }
  }

  @Test
  public void testCloneEventTemplate() throws UnknownEventException, Exception {
    CtClass myClass = new ClassBuilder("testCloneEventTemplateClass")
        .beginMethod()
          .setName("registeredMethod")
        .endMethod()
        .ctClass();

    Integer index = registry.register(myClass.getDeclaredMethod("registeredMethod"));
    assertTrue(registry.cloneEventTemplate(index, "") != null);

    thrown.expect(UnknownEventException.class);
    registry.cloneEventTemplate(Integer.MAX_VALUE, "");
  }
}
