# stripe-example
[![Build Status](https://travis-ci.org/gregwhitaker/stripe-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/stripe-example)

An example of integrating [Stripe](https://www.stripe.com) payments with a web application.

## Prerequisites
This example requires that you create a [Stripe](https://www.stripe.com) account with a set of API keys. When you create a new
set of API keys you will receive a `Publishable Key` and a `Secret Key` that are needed when you run the example using the
instructions below.

## Running the Example

1. Start the example can be run using the following Gradle command:

        $ RATPACK_STRIPE__PUBLISH_KEY={stripe publish key} RATPACK_STRIPE__SECRET_KEY={stripe secret key} ./gradlew run
    
2. Once the application has started, point your web browser to [http://localhost:5050](http://localhost:5050) to access the test page.

3. Click the `Pay with Card` button and use the information for one of the [Stripe Test Credit Cards](https://stripe.com/docs/testing#cards) to complete the transaction.

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/stripe-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.