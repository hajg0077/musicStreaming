package com.example.musicstreaming

import com.example.musicstreaming.service.MusicDto
import com.example.musicstreaming.service.MusicEntity

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )

fun MusicDto.mapper(): PlayerModel =
    PlayerModel(
        playMusicList = musics.mapIndexed { index, musicEntity ->
        musicEntity.mapper(index.toLong()) }
    )