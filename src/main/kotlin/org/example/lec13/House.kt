package org.example.lec13

//class House(
//    private val address: String,
//    private val livingRoom: LivingRoom = LivingRoom(10.0)
//) {
//
//    class LivingRoom(
//        private var area: Double
//    )
//}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    inner class LivingRoom(
        private var area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}