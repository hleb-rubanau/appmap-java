## [1.1.7](https://github.com/hleb-rubanau/appmap-java/compare/v1.1.6...v1.1.7) (2021-05-11)


### Bug Fixes

* **ci:** re-trigger deployment (under new artifact id) ([763ac5f](https://github.com/hleb-rubanau/appmap-java/commit/763ac5f14596514477974c4fbb111fb8a67bc4d0))

## [1.1.6](https://github.com/hleb-rubanau/appmap-java/compare/v1.1.5...v1.1.6) (2021-05-11)


### Bug Fixes

* **ci:** re-trigger deployment ([af6e798](https://github.com/hleb-rubanau/appmap-java/commit/af6e798754347cd3a4a5feda5ed232a4dc38c5a0))

## [1.1.5](https://github.com/hleb-rubanau/appmap-java/compare/v1.1.4...v1.1.5) (2021-05-10)


### Bug Fixes

* **ci:** trigger new Travis build to tweak description on formerly released package ([916596d](https://github.com/hleb-rubanau/appmap-java/commit/916596d06197958493d4c1b5f7d4218e70d1f17a))

## [1.1.4](https://github.com/hleb-rubanau/appmap-java/compare/v1.1.3...v1.1.4) (2021-05-10)


### Bug Fixes

* **ci:** nothing changed but we need new version due to bug in Travis settings ([dc6fb0c](https://github.com/hleb-rubanau/appmap-java/commit/dc6fb0c08528116fb6bd184a8fc889a90ba4e069))

## [1.1.3](https://github.com/hleb-rubanau/appmap-java/compare/v1.1.2...v1.1.3) (2021-05-10)


### Bug Fixes

* **ci:** make package description parameterizable ([a27fa56](https://github.com/hleb-rubanau/appmap-java/commit/a27fa566f88868b00e08303403e5110ba9ffd93b))

## [1.1.2](https://github.com/hleb-rubanau/appmap-java/compare/v1.1.1...v1.1.2) (2021-04-13)


### Bug Fixes

* **gradle:** nexus publishing tolerance to missing configuration context (to avoid blocking pure builds) ([70059e7](https://github.com/hleb-rubanau/appmap-java/commit/70059e7372c8bfe11483337dca6575c197e1210b))
* **gradle:** now for the full deployment cycle ([aceafb5](https://github.com/hleb-rubanau/appmap-java/commit/aceafb5f3f8763da5f1f5b2091f52d31ec96b558))
* **gradle:** stub change to trigger rebuild (diagnosting intermittent travis errors) ([8d8a12b](https://github.com/hleb-rubanau/appmap-java/commit/8d8a12b9a9b8c310a710df3af0a2ed29fa96b9d4))

## [1.1.1](https://github.com/hleb-rubanau/appmap-java/compare/v1.1.0...v1.1.1) (2021-04-13)


### Bug Fixes

* **gradle:** shorten url base to conform with Gradle Nexus conventions (maven-publish used more precisely defined url) ([10ad05c](https://github.com/hleb-rubanau/appmap-java/commit/10ad05cd746d1fdd33ee749e622eeab757004a2a))

# [1.1.0](https://github.com/hleb-rubanau/appmap-java/compare/v1.0.4...v1.1.0) (2021-04-13)


### Bug Fixes

* **gradle:** cosmetic change, there is certainly no closures ([350b79a](https://github.com/hleb-rubanau/appmap-java/commit/350b79a4c1fb9fb415701098ced415bcc74b1622))
* **gradle:** more debugging ([bbcb8c0](https://github.com/hleb-rubanau/appmap-java/commit/bbcb8c046005479234ba387b640683cfff24f19b))


### Features

* **gradle:** cosmetic change to trigger version bump ([b62d1e6](https://github.com/hleb-rubanau/appmap-java/commit/b62d1e6383846ae65750a1cf3194e9e31b947b90))

## [1.0.5](https://github.com/hleb-rubanau/appmap-java/compare/v1.0.4...v1.0.5) (2021-04-13)


### Bug Fixes

* **gradle:** cosmetic change, there is certainly no closures ([350b79a](https://github.com/hleb-rubanau/appmap-java/commit/350b79a4c1fb9fb415701098ced415bcc74b1622))

## [1.0.4](https://github.com/hleb-rubanau/appmap-java/compare/v1.0.3...v1.0.4) (2021-04-13)


### Bug Fixes

* **gradle:** more debugging ([8bc1fe8](https://github.com/hleb-rubanau/appmap-java/commit/8bc1fe83ecdc98f8756e3752a00dc1503d9739c4))
* **gradle:** roll back to straight plain syntax which triggers the bug ([2e65724](https://github.com/hleb-rubanau/appmap-java/commit/2e65724ee5df99fcaf121be36996dff956fec0e9))

## [1.0.3](https://github.com/hleb-rubanau/appmap-java/compare/v1.0.2...v1.0.3) (2021-04-13)


### Bug Fixes

* **gradle:** experimenting with closures ([ecb4837](https://github.com/hleb-rubanau/appmap-java/commit/ecb4837605e2907eceb7678620bc4fe2d592c409))

## [1.0.2](https://github.com/hleb-rubanau/appmap-java/compare/v1.0.1...v1.0.2) (2021-04-13)


### Bug Fixes

* **gradle:** disable debug step ([6cc9b9b](https://github.com/hleb-rubanau/appmap-java/commit/6cc9b9b039fc10dbc0d314e017a5a690932ef5c8))

## [1.0.1](https://github.com/hleb-rubanau/appmap-java/compare/v1.0.0...v1.0.1) (2021-04-13)


### Bug Fixes

* **gradle:** specify group for the root project, also try lazy evaluation of the properties ([39d8158](https://github.com/hleb-rubanau/appmap-java/commit/39d8158cc8ec0ce422738cfc07e3509e3af87fc5))

# 1.0.0 (2021-04-13)


### Bug Fixes

* **gradle:** add debugging output ([8b63cfa](https://github.com/hleb-rubanau/appmap-java/commit/8b63cfaeb949549ec8436dddcdf57351a70905d6))
* **gradle:** add debugging output ([e577d30](https://github.com/hleb-rubanau/appmap-java/commit/e577d3075404e3830533dc30cf722eb28e7e83a8))
* **gradle:** alternative way of specifying nexus credentials ([2df78dd](https://github.com/hleb-rubanau/appmap-java/commit/2df78dd75fccfa4c3a7b55b98ce7328fbf6eb8df))
* **gradle:** alternative way of specifying nexus credentials ([a018510](https://github.com/hleb-rubanau/appmap-java/commit/a018510e3685c04dbf1ef7b2128c842ca8798a53))
* **gradle:** broken gradle directives ([b529ea2](https://github.com/hleb-rubanau/appmap-java/commit/b529ea2ac984b003c100a78619591ecf106d3a2d))
* **gradle:** fix typo ([7d11ffa](https://github.com/hleb-rubanau/appmap-java/commit/7d11ffa18bb42225a2de121fc888592eb7c88f82))
* **gradle:** troubleshoot testenv ([80e7b29](https://github.com/hleb-rubanau/appmap-java/commit/80e7b29efec25489b82f5d6ffb3757c07c8c1aa5))
* **gradle:** troubleshoot testenv ([5c16f70](https://github.com/hleb-rubanau/appmap-java/commit/5c16f70d82e3a41f512c9e863a73f84f3226d291))
* Allow classes compiled without locals to be hooked ([0e0a0d3](https://github.com/hleb-rubanau/appmap-java/commit/0e0a0d333bf1b3323492765aa29df064a1de027d))
* Capture exceptions thrown from SQL interfaces ([9d1e66f](https://github.com/hleb-rubanau/appmap-java/commit/9d1e66fe7254bb262bf6b1ab2b8156d1bd1fee77))
* disable http client requests ([#60](https://github.com/hleb-rubanau/appmap-java/issues/60)) ([2131d82](https://github.com/hleb-rubanau/appmap-java/commit/2131d822d8026900f00bacac7ccb8b146c65d464))
* Don't append System path to class pools ([681d74e](https://github.com/hleb-rubanau/appmap-java/commit/681d74ec843a5b4c7acf317114cd54766a3b2d87))
* improve path and package resolution ([#62](https://github.com/hleb-rubanau/appmap-java/issues/62)) ([c3ba3df](https://github.com/hleb-rubanau/appmap-java/commit/c3ba3df5286cba6efd929e6cdcf583ebc28b96b2))
* Provide better error message when encountering an unknown event ([c69a877](https://github.com/hleb-rubanau/appmap-java/commit/c69a87779a5a33994b295aade6cfcfd188d3cc37))


### Features

* **docs:** improve CI documentation and also trigger the relase ([e6b5a8e](https://github.com/hleb-rubanau/appmap-java/commit/e6b5a8ed21866d0ae17d5328f671219cd7c9099b))
* AppMap Maven plugin ([#46](https://github.com/hleb-rubanau/appmap-java/issues/46)) ([1798df2](https://github.com/hleb-rubanau/appmap-java/commit/1798df254f76155bdae9d74ff1f32b7be6f1d15b))
* appmap.yml errors are logged to stderr ([e746253](https://github.com/hleb-rubanau/appmap-java/commit/e7462538725142b50638c036835e04345f1a81d4))

## [1.0.4](https://github.com/applandinc/appmap-java/compare/v1.0.3...v1.0.4) (2021-04-08)


### Bug Fixes

* Don't append System path to class pools ([681d74e](https://github.com/applandinc/appmap-java/commit/681d74ec843a5b4c7acf317114cd54766a3b2d87))
* Provide better error message when encountering an unknown event ([c69a877](https://github.com/applandinc/appmap-java/commit/c69a87779a5a33994b295aade6cfcfd188d3cc37))

## [1.0.3](https://github.com/applandinc/appmap-java/compare/v1.0.2...v1.0.3) (2021-03-22)


### Bug Fixes

* Allow classes compiled without locals to be hooked ([0e0a0d3](https://github.com/applandinc/appmap-java/commit/0e0a0d333bf1b3323492765aa29df064a1de027d))
* Capture exceptions thrown from SQL interfaces ([9d1e66f](https://github.com/applandinc/appmap-java/commit/9d1e66fe7254bb262bf6b1ab2b8156d1bd1fee77))

## [1.0.2](https://github.com/applandinc/appmap-java/compare/v1.0.1...v1.0.2) (2021-03-18)


### Bug Fixes

* improve path and package resolution ([#62](https://github.com/applandinc/appmap-java/issues/62)) ([c3ba3df](https://github.com/applandinc/appmap-java/commit/c3ba3df5286cba6efd929e6cdcf583ebc28b96b2))

## [1.0.1](https://github.com/applandinc/appmap-java/compare/v1.0.0...v1.0.1) (2021-03-17)


### Bug Fixes

* disable http client requests ([#60](https://github.com/applandinc/appmap-java/issues/60)) ([2131d82](https://github.com/applandinc/appmap-java/commit/2131d822d8026900f00bacac7ccb8b146c65d464))

# 1.0.0 (2021-03-17)


### Features

* AppMap Maven plugin ([#46](https://github.com/applandinc/appmap-java/issues/46)) ([1798df2](https://github.com/applandinc/appmap-java/commit/1798df254f76155bdae9d74ff1f32b7be6f1d15b))
* appmap.yml errors are logged to stderr ([e746253](https://github.com/applandinc/appmap-java/commit/e7462538725142b50638c036835e04345f1a81d4))

## 0.5.1 (2021-03-09)

### Added

- System.err logs on configuration failures.

## 0.5.0 (2020-11-04)

### Added

- Support for capturing `http_client_request` and `http_client_response` events
  for Java 8 applications.

## 0.4.3 (2020-10-08)

### Fixed

- ReflectiveType.invoke now makes the method accessible before trying to invoke
  it.

## 0.4.2 (2020-10-06 (yanked))

### Added

- The new system property `appmap.debug.http` to show some debugging when
  handling requests for `/_appmap/record`.

### Changed

- Cleaned up reflection in `HttpServletRequest`, `HttpServletResponse`, and
  `FilterChain`.

## 0.4.1 (2020-08-25)

### Added

- The new system property `appmap.record` can be used to specify a method to
  record.
- The system property `appmap.debug.file`. When set, debug output will be
  written to the specified file, instead of to `System.err`.

### Changed

- `appmap-java` now uses significantly less memory when recording.

## 0.4.0 (2020-08-06)

### Added

- Tests annotated with `org.testng.annotations.Test` are now recorded.

## 0.3.2 (2020-07-30)

### Fixed

- Added callback handlers with `METHOD_EXCEPTION` method event to close
  recording of current session for `Junit` and `Jupiter` Tests.

## 0.3.1 (2020-07-15)

### Fixed

- Dependencies of `appmap-java` which use `slf4j` will now use a nop
  implementation in order to stop them from logging if the client application
  provides it's own implementation. If left up to the client application,
  `appmap-java` can interfere with test frameworks by corrupting stdout.
- `appmap-java` will no longer call `Thread` methods that may be extended by the
  client application resulting in a stack overflow.
- `appmap-java` no longer assumes that `Thread` identifiers are unique.
  Previously, this could result in concurrent modificiations to resources not
  meant to be shared across threads.

## 0.3.0 (2020-07-08)

### Fixed

- Removed a potential deadlock that could occur if the user's code required a
  lock in `toString`.
- Output directories will be recursively created

### Added

- `appmap.event.valueSize` can be used to specify the length of a value string
  before truncation occurs.
- `Recorder.record` will record and output the execution of a `Runnable`.

### Changed

- In `appmap.yml` a package item can now have an empty `path`, allowing the user
  to specify a list of exclusions only. This can be useful for excluding groups
  of tests not meant to be captured.
- The default output directory for appmap files is now `./tmp/appmap`. This
  directory will be created automatically if it does not exist.

## 0.2.1 (2020-07-01)

### Fixed

- `appmap.output.directory` will be created if it does not exist. Previously
  this resulted in a null pointer exception when recording.
- Parsing errors in `appmap.yml` will stop the application from running and emit
  a useful error.

## 0.2.0 (2020-06-29)

### Added

- Support for Jakarta

### Removed

- `javax.servlet` dependency

### Changed

- All logging is disabled by default. To enable logging use the `appmap.debug`
  system property.
- Loading times have been reduced significantly.

## 0.1.0 (2020-06-05)

### Added

- Name property added to appmap metadata
- HTTP request parameters are captured
- Spring path params are captured
- Spring normalized path info is captured
- Support for JUnit Jupiter

### Fixed

- Feature group metadata is now written to the correct key

## 0.0.2 (2020-05-15)

### Added

- `language` object in `metadata` now includes `version` and `engine` based on
  the Java runtime.
- `sql_query` events now include `database_type` as reported by the database
  driver.

## 0.0.1 (2020-04-28)

### Added

- Versioning has begun. The authoritative `version` is now declared in
  [`build.gradle`](build.gradle).
- Feature and feature group metadata fields are now written to scenarios
  captured from test cases.
