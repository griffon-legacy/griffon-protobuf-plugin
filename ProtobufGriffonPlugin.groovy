/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class ProtobufGriffonPlugin {
    // the plugin version
    String version = '0.6'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-protobuf-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Enables interoperability between JVM languages'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Provides integration with [Google Protocol Buffers][1] – a language-neutral, platform-neutral, extensible way of
serializing structured data for use in communications protocols, data storage, and more.

Usage
-----
This plugin requires you to have a valid protoc compiler installed. Follow the installation instructions laid out
in the [java tutorial][2]. Once installed you must instruct the build where to locate the `protoc` executable.
Edit `griffon-app/conf/BuildConfig.groovy` with the following content

    google.protobuf.protoc = "/usr/local/bin/protoc" // change this path to your own path

Place your `.proto` sources at `$basedir/src/protobuf`. They will be automatically compiled to java sources
(and classes) whenever the application is compiled. Alternatively you may call the `protoc` command to compile protobuf
sources at any time.

Scripts
-------

 * **protoc** - compiles protobuf sources (.proto) then compiles the generated java sources.

[1]: http://code.google.com/apis/protocolbuffers/docs/overview.html
[2]: http://code.google.com/apis/protocolbuffers/docs/javatutorial.html
'''
}
