package user.minicrm.server.util;

import org.apache.any23.encoding.TikaEncodingDetector;
import org.zkoss.zk.ui.util.CharsetFinder;

import java.io.IOException;
import java.io.InputStream;

public class TikaCharsetFinder implements CharsetFinder {
    @Override
    public String getCharset(String contentType, InputStream content) throws IOException {
        String charSetName= new TikaEncodingDetector().guessEncoding(content);
        AttachmentHandler.setCharsetName(charSetName);
        return charSetName;
    }
}
