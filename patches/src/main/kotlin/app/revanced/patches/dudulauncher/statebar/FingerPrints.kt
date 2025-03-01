package app.revanced.patches.dudulauncher.statebar

import app.revanced.patcher.fingerprint

val stateBarStillShowOnKeybaordFingerprint = fingerprint {
    parameters("Lcom/dudu/autoui/service/DuduAccessibilityService;")
    returns("V")
    strings("winparams.height:")
}