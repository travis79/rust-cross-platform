//
//  ViewController.swift
//  Greetings
//
//  Created by Travis Long on 12/17/18.
//  Copyright © 2018 Travis Long. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let rustGreetings = RustGreetings()
        print("\(rustGreetings.sayHello(to: "world"))")
    }


}

