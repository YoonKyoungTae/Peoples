package dev.androidblog.peoples.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import timber.log.Timber

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    var binding: VB? = null

    abstract fun bindingLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate : ${binding?.javaClass?.name}")
        initView()
    }

    private fun initView() {
        binding = DataBindingUtil.setContentView(this, bindingLayoutId())
        setContentView(binding?.root)
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume : ${binding?.javaClass?.name}")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause : ${binding?.javaClass?.name}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy : ${binding?.javaClass?.name}")
        binding = null
    }
}