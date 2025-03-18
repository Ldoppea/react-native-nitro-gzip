package com.margelo.nitro.nitrogzip

import com.facebook.proguard.annotations.DoNotStrip
import android.util.Log
import com.facebook.jni.HybridData
import com.margelo.nitro.core.Promise

@DoNotStrip
class NitroGzip : HybridNitroGzipSpec() {
  companion object {
    const val TAG = "HybridGzip"
  }

  override fun unTar(sourcePath: String, targetPath: String, force: Boolean): Promise<GzipResult> {
    Log.d(TAG, "unTar: ${sourcePath}")
    return Promise.async {
      GzipResult("somePath")
    }
  }

  override fun unGzip(sourcePath: String, targetPath: String, force: Boolean): Promise<GzipResult> {
    Log.d(TAG, "unGzip: ${sourcePath}")
    return Promise.async {
      GzipResult("somePath")
    }
  }

  override fun unGzipTar(sourcePath: String, targetPath: String, force: Boolean): Promise<GzipResult> {
    Log.d(TAG, "unGzipTar: ${sourcePath}")
    return Promise.async {
      GzipResult("somePath")
    }
  }
}
