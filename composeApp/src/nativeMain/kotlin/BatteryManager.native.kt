import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        UIDevice.currentDevice.batteryMonitoringEnable = true
        val batteryLevel = UIDevice.currentDevice.batteryMonitoringEnable

        return (batteryLevel * 100).roundToInt()
    }
}