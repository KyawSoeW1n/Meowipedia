package com.everest.ui.dialog

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Composable
fun LoadingDialog(
    onDismiss: () -> Unit,
    isEnableOnBackPress: Boolean = true
) {
    Dialog(
        onDismissRequest = { onDismiss() },
        DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(100.dp)
        ) {
            CircularProgressIndicator()
            if (!isEnableOnBackPress) {
                BackHandler {
                }
            }
        }
    }
}
