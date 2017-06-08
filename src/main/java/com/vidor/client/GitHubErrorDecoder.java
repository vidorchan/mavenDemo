package com.vidor.client;

import feign.Response;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;

import java.io.IOException;

/**
 * Created by tim on 2017/6/7.
 */
public class GitHubErrorDecoder implements ErrorDecoder {

    final Decoder decoder;
    final ErrorDecoder defaultDecoder = new ErrorDecoder.Default();

    public GitHubErrorDecoder(Decoder decoder) {
        this.decoder = decoder;
    }

    @Override
    public Exception decode(String methodKey, Response response) {
        try {
            return (Exception) decoder.decode(response, GitHubClientError.class);
        } catch (IOException fallbackToDefault) {
            return defaultDecoder.decode(methodKey, response);
        }
    }
}
