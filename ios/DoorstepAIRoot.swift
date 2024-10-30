import SwiftUI
import UIKit
import React
import DoorstepPathwayFramework

@objc(DoorstepAIRoot)
class DoorstepAIRoot: RCTViewManager {

  override func view() -> UIView! {
    return RootDoorstepAIUIView()
  }

  @objc override static func requiresMainQueueSetup() -> Bool {
    return true
  }

  @objc override static func moduleName() -> String! {
    return "DoorstepAIRoot"
  }
}
