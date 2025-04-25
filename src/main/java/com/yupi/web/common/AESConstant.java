package com.yupi.web.common;

import java.io.File;

/**
 * AES常量接口
 */
public interface AESConstant {

    String ALGORITHM = "AES";

    String CONFUSION = "***********";

    String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    String KEY_FILE_PATH = System.getProperty("user.dir") + File.separator + "src/main/java/com/yupi/web/model/temp/aes_key.bin";

    String IV_FILE_PATH = System.getProperty("user.dir") + File.separator + "src/main/java/com/yupi/web/model/temp/aes_iv.bin";

}