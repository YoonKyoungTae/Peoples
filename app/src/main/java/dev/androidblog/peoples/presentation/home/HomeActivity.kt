package dev.androidblog.peoples.presentation.home

import android.os.Bundle
import androidx.activity.viewModels
import dev.androidblog.peoples.R
import dev.androidblog.peoples.databinding.ActivityHomeBinding
import dev.androidblog.peoples.presentation.base.BaseActivity

class HomeActivity: BaseActivity<ActivityHomeBinding>() {

    private val viewModel: HomeViewModel by viewModels()

    override fun bindingLayoutId(): Int = R.layout.activity_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}