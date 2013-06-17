
ProcolBuffers integration
-------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/protobuf](http://artifacts.griffon-framework.org/plugin/protobuf)


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

Configuration
-------------

Protobuf version currently supported is **2.4.1**.

Scripts
-------

 * **protoc** - compiles protobuf sources (.proto) then compiles the generated java sources.

[1]: http://code.google.com/apis/protocolbuffers/docs/overview.html
[2]: http://code.google.com/apis/protocolbuffers/docs/javatutorial.html

