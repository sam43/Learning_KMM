package com.example.myapplication.helper

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter


expect object ImageRes {
    @Composable
    fun alovera(): Painter
    @Composable
    fun rose(): Painter
    @Composable
    fun calendula(): Painter
    @Composable
    fun chamomile(): Painter
    @Composable
    fun cilantro(): Painter
    @Composable
    fun cucumber(): Painter
    @Composable
    fun lavender(): Painter
    @Composable
    fun orange(): Painter
    @Composable
    fun jojoba(): Painter
    @Composable
    fun kiwi(): Painter
    @Composable
    fun rosemary(): Painter
    @Composable
    fun tea_tree(): Painter
}