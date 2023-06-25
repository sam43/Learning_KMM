package com.example.myapplication.helper

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource


@OptIn(ExperimentalResourceApi::class)
actual object ImageRes {
    @Composable
    actual fun alovera(): Painter = painterResource("MR/images/alovera.png")
    @Composable
    actual fun rose(): Painter = painterResource("MR/images/rose.png")
    @Composable
    actual fun calendula(): Painter = painterResource("MR/images/calendula.png")
    @Composable
    actual fun chamomile(): Painter = painterResource("MR/images/chamomile.png")
    @Composable
    actual fun cilantro(): Painter = painterResource("MR/images/cilantro.png")
    @Composable
    actual fun cucumber(): Painter = painterResource("MR/images/cucumber.png")
    @Composable
    actual fun lavender(): Painter = painterResource("MR/images/lavender.png")
    @Composable
    actual fun orange(): Painter = painterResource("MR/images/orange.png")
    @Composable
    actual fun jojoba(): Painter = painterResource("MR/images/jojoba.png")
    @Composable
    actual fun kiwi(): Painter = painterResource("MR/images/kiwi.png")
    @Composable
    actual fun rosemary(): Painter = painterResource("MR/images/rosemary.png")
    @Composable
    actual fun tea_tree(): Painter = painterResource("MR/images/tea_tree.png")
}