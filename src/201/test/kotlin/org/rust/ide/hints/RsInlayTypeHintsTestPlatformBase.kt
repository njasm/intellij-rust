/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.ide.hints

import org.rust.RsTestBase
import com.intellij.codeInsight.hints.LinearOrderInlayRenderer

// BACKCOMPAT: 2019.3.
abstract class RsInlayTypeHintsTestPlatformBase : RsTestBase() {
    protected fun checkInlays() {
        myFixture.testInlays(
            { (it.renderer as LinearOrderInlayRenderer<*>).toString() },
            { it.renderer is LinearOrderInlayRenderer<*> }
        )
    }
}
