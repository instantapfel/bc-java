package org.bouncycastle.est;


/**
 * ESTHijacker can take control of the source after the initial http request
 * has been sent and a response received.
 * A hijacker is then able to send more request or be able to modify the response before returning a response
 * to the original caller.
 *
 * See DigestAuth and BasicAuth.
 */
public interface ESTHttpHijacker
{
    ESTResponse hijack(ESTRequest req, Source sock)
        throws Exception;
}
