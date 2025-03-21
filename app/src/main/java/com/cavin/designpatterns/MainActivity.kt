package com.cavin.designpatterns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.cavin.designpatterns.ui.theme.JetpackComposeDesignPatternsTheme
import com.cavin.designpatterns.views.AbstractFactoryView
import com.cavin.designpatterns.views.AdaptorView
import com.cavin.designpatterns.views.BridgeView
import com.cavin.designpatterns.views.ChainOfResponsibilityView
import com.cavin.designpatterns.views.CommandPatternView
import com.cavin.designpatterns.views.CompositeView
import com.cavin.designpatterns.views.DecoratorPatternExample
import com.cavin.designpatterns.views.FacadeView
import com.cavin.designpatterns.views.FlyWeightView
import com.cavin.designpatterns.views.InterpreterView
import com.cavin.designpatterns.views.ProtoTypeView
import com.cavin.designpatterns.views.ProxyView
import com.cavin.designpatterns.views.SingletonView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeDesignPatternsTheme {
                CommandPatternView()
            }
        }
    }
}

