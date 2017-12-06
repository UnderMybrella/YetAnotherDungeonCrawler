package org.abimon.yetAnotherDungeonController.dungeonSegments.handle

import org.abimon.yetAnotherDungeonController.utils.EnumDirection

interface IRoom {
    val exits: List<Pair<Array<EnumDirection>, String>>
    val uid: String

    /**
     * @param direction The direction from this room to [exit]
     */
    fun addExit(direction: EnumDirection, exit: String)
}