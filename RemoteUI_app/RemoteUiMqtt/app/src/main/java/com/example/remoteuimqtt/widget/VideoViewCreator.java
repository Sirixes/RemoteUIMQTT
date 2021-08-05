package com.example.remoteuimqtt.widget;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;

import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.TreeElement;
import com.example.remoteuimqtt.widget.widgetInterface.VideoView;

public class VideoViewCreator implements VideoView {

    @Override
    public View createVideoView(LayoutInflater layoutInflater, TreeElement treeElement) {
        View videoView = layoutInflater.inflate(R.layout.video_layout, null);
        android.widget.VideoView video = videoView.findViewById(R.id.videoView);
        video.setTag(treeElement.getId());
        video.setVideoURI(Uri.parse("rtsp://wowzaec2demo.streamlock.net/vod/mp4:BigBuckBunny_115k.mov"));
        video.start();
        return videoView;
    }

}
