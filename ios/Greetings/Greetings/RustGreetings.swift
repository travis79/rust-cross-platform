//
//  RustGreetings.swift
//  Greetings
//
//  Created by Travis Long on 12/17/18.
//  Copyright © 2018 Travis Long. All rights reserved.
//

import Foundation

class RustGreetings {
    func sayHello(to: String) -> String {
        let result = rust_greeting(to)
        let swift_result = String(cString: result!)
        rust_greeting_free(UnsafeMutablePointer(mutating: result))
        return swift_result
    }
}
