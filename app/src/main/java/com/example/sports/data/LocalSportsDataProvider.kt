/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.sports.data

import com.example.sports.R
import com.example.sports.model.Sport

/**
 * Sports data
 */
object LocalSportsDataProvider{
    val defaultSport = getSportsData()[0]

    fun getSportsData(): List<Sport> {
        return listOf(
            Sport(
                id = 1,
                titleResourceId = R.string.parque,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 4,
                olympic = true,
                imageResourceId = R.drawable.parque,
                sportsImageBanner = R.drawable.parque,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 2,
                titleResourceId = R.string.paulista,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.paulista,
                sportsImageBanner = R.drawable.paulista,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 3,
                titleResourceId = R.string.terraço,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.terraco,
                sportsImageBanner = R.drawable.terraco,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 4,
                titleResourceId = R.string.campos,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 1,
                olympic = false,
                imageResourceId = R.drawable.campos,
                sportsImageBanner = R.drawable.campos,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 5,
                titleResourceId = R.string.liberdade,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.liberdade,
                sportsImageBanner = R.drawable.liberdade,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 6,
                titleResourceId = R.string.museu,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 1,
                olympic = false,
                imageResourceId = R.drawable.museu_ipiranga,
                sportsImageBanner = R.drawable.museu_ipiranga,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 7,
                titleResourceId = R.string.neo_quimica,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.neo,
                sportsImageBanner = R.drawable.neo,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 8,
                titleResourceId = R.string.allianz,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 11,
                olympic = true,
                imageResourceId = R.drawable.allianz,
                sportsImageBanner = R.drawable.allianz,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 9,
                titleResourceId = R.string.jardim,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.jardim,
                sportsImageBanner = R.drawable.jardim,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 10,
                titleResourceId = R.string.portuguesa,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.museu,
                sportsImageBanner = R.drawable.museu,
                sportDetails = R.string.sport_detail_text
            ),
            Sport(
                id = 11,
                titleResourceId = R.string.shopping,
                subtitleResourceId = R.string.sports_list_subtitle,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.shopping,
                sportsImageBanner = R.drawable.shopping,
                sportDetails = R.string.sport_detail_text
            )
        )
    }
}
