[![Build Status](https://travis-ci.org/johnjohndoe/droidconberlin-base.svg?branch=master)](https://travis-ci.org/johnjohndoe/droidconberlin-base) [![Download](https://api.bintray.com/packages/tbsprs/maven/droidconberlin-base/images/download.svg)](https://bintray.com/tbsprs/maven/droidconberlin-base/_latestVersion) [![Apache License](http://img.shields.io/badge/license-Apache%20License%202.0-lightgrey.svg)](http://choosealicense.com/licenses/apache-2.0/) [![JitPack](https://jitpack.io/v/johnjohndoe/droidconberlin-base.svg)][jitpack-droidconberlin-base]

# droidconberlin-base library

![Droidcon Berlin logo](gfx/droidcon-berlin-logo-300x300.png "Droidcon Berlin logo")

A Kotlin library containing a parser and models for the Droidcon Berlin API:

* https://cfp.droidcon.de/rest/sessions.json
* https://cfp.droidcon.de/rest/speakers.json // not yet implemented


## Gradle build

To deploy the library to your local Maven repository run the following task:

```bash
$ ./gradlew publishToMavenLocal
```

Then, to use the library in your project add the following to
your top level `build.gradle`:

```
allprojects {
    repositories {
        jcenter()
        mavenLocal()
    }
}
```

and to your application module `build.gradle`:


```groovy
dependencies {
    compile "info.metadude.kotlin.library.droidconberlin:droidconberlin-base:$version"
}
```

Alternatively, you can use [JitPack][jitpack-droidconberlin-base] to fetch and
build the sources directly from this repository.


## Tests

Run the following command to execute all tests:

```groovy
$ ./gradlew clean test
```

## Author

* [Tobias Preuss][tobias-preuss]

## License

    Copyright 2018 Tobias Preuss

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[jitpack-droidconberlin-base]: https://jitpack.io/#johnjohndoe/droidconberlin-base
[tobias-preuss]: https://github.com/johnjohndoe
