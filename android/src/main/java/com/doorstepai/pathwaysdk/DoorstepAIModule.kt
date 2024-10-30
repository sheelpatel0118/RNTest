package com.testmodule;
import com.doorstepai.doorstepaiandroidsdk.DoorstepAI
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class DoorstepAIModule(reactContext: ReactApplicationContext): ReactContextBaseJavaModule(reactContext) {

  @ReactMethod
  fun start() {
    DoorstepAI().start(context = this.reactApplicationContext)
  }

  @ReactMethod
  fun stop() {
    DoorstepAI().stop(context = this.reactApplicationContext)
  }

   @ReactMethod(isBlockingSynchronousMethod = true)
  fun setToken(token: String) {
    DoorstepAI().setToken(token)
  }

  override fun getName(): String {
    return "DoorstepAIModule"
  }

}
