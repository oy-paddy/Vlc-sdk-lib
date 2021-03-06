package org.videolan.vlc.util;

import android.graphics.Bitmap;

import org.videolan.libvlc.Media;
import org.videolan.libvlc.util.VLCUtil;

import java.nio.ByteBuffer;

/**
 * Created by yuyunlong on 2017/9/13/013.
 */

public class ThumbnailUtils {


    public static Bitmap getThumbnail(Media media, int width, int height) {
        byte[] b = VLCUtil.getThumbnail(media, width, height);
        LogUtils.i("ThumbnailUtils", "1getThumbnail=" + (b == null));
        if (b != null) {
            // Create the bitmap
            Bitmap thumbnail = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            thumbnail.copyPixelsFromBuffer(ByteBuffer.wrap(b));
            return thumbnail;
        }
        return null;
    }

}
