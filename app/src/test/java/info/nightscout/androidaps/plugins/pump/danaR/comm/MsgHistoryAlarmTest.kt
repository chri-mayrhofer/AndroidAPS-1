package info.nightscout.androidaps.plugins.pump.danaR.comm

import info.nightscout.androidaps.danar.comm.MsgHistoryAlarm
import info.nightscout.androidaps.plugins.bus.RxBusWrapper
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
class MsgHistoryAlarmTest : DanaRTestBase() {

    val rxBus = RxBusWrapper()

    @Test fun runTest() {
        val packet = MsgHistoryAlarm(aapsLogger, rxBus, dateUtil, databaseHelper)
        // nothing left to test
    }
}