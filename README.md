# embark-template

My [Leiningen](http://leiningen.org/) template for creating simple Clojure + ClojureScript web apps.

## Usage

    lein new embark [project-name]

Once your project is created, an example ring handler is created and ready to run:

    lein ring server

The index ring handler renders the templates/index.html template, which extends layout.html.

An example ClojureScript test has been created, which is also ready to run:

    lein cljsbuild test

## What's in it

- [Compojure](https://github.com/weavejester/compojure)
- [ClojureScript](https://github.com/clojure/clojurescript)
- [clojurescript.test](https://github.com/cemerick/clojurescript.test) (requires [PhantomJS](http://phantomjs.org/))
- [Selmer](https://github.com/yogthos/selmer)

## Why?

I wanted something small that could get new exploratory projects up and running quickly, with tests that work out of the box.

## Installation

    git clone git@github.com:inchingforward/embark-template.git
    cd embark-template
    lein install

## Notes

A default MIT License is included.

## License

Copyright © 2014 Mike Janger

Distributed under the [MIT license](http://www.opensource.org/licenses/MIT).
