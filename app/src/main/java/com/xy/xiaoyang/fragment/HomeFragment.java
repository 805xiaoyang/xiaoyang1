package com.xy.xiaoyang.fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.xy.xiaoyang.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {
    @BindView(R.id.webview)
    WebView webView;
    @BindView(R.id.refresh)
    SwipeRefreshLayout refresh;

    /*private WebView webView;
    private  SwipeRefreshLayout refresh;*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmen_home, container, false);
        ButterKnife.bind(this,view);

        initView();
        return view;

    }

    private void initView() {

        refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refresh.setRefreshing(false);
                webView.loadUrl("https://www.apple.com/");
            }
        });

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl("https://www.apple.com/");
    }
}
