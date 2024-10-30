import Foundation
import DoorstepPathwayFramework

@objc(DoorstepAIModule)
class DoorstepAIModule: NSObject {

  @objc
  func start() -> Void {
    DoorstepAI.start()
  }

  @objc
  func stop() -> Void {
    DoorstepAI.stop()
  }

  @objc
  static func requiresMainQueueSetup() -> Bool {
    return true
  }
}
