//
//  ComposeView.swift
//  iosApp
//
//  Created by A S M Sayem on 25/6/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> some UIViewController {
        ApptKt.MainVC()
    }
    
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {}
}
  
