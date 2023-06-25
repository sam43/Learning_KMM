package com.example.myapplication.helper

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.myapplication.R
import dev.icerock.moko.resources.ImageResource

actual object ImageRes {
    @Composable
    actual fun alovera(): Painter = painterResource(R.drawable.aloe_vera)
    @Composable
    actual fun rose(): Painter = painterResource(R.drawable.rose)
    @Composable
    actual fun calendula(): Painter = painterResource(R.drawable.calendula)
    @Composable
    actual fun chamomile(): Painter = painterResource(R.drawable.chamomile)
    @Composable
    actual fun cilantro(): Painter = painterResource(R.drawable.cilantro)
    @Composable
    actual fun cucumber(): Painter = painterResource(R.drawable.cucumber)
    @Composable
    actual fun lavender(): Painter = painterResource(R.drawable.lavender)
    @Composable
    actual fun orange(): Painter = painterResource(R.drawable.orange)
    @Composable
    actual fun jojoba(): Painter = painterResource(R.drawable.jojoba)
    @Composable
    actual fun kiwi(): Painter = painterResource(R.drawable.kiwi)
    @Composable
    actual fun rosemary(): Painter = painterResource(R.drawable.rosemary)
    @Composable
    actual fun tea_tree(): Painter = painterResource(R.drawable.tea_tree)
}