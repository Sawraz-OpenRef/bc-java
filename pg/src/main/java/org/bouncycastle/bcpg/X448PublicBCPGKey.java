package org.bouncycastle.bcpg;

import java.io.IOException;

/**
 * Public key of type {@link PublicKeyAlgorithmTags#X448}.
 * This type was introduced with RFC9580 and can be used with v4, v6 keys.
 * Note however, that legacy implementations might not understand this key type yet.
 * For a key type compatible with legacy v4 implementations, see {@link ECDHPublicBCPGKey} with
 * {@link PublicKeyAlgorithmTags#ECDH}.
 *
 * @see <a href="https://www.rfc-editor.org/rfc/rfc9580.html#name-algorithm-specific-part-for-x4">
 *     OpenPGP - Algorithm-Specific Part for X448 Keys</a>
 */
public class X448PublicBCPGKey
        extends OctetArrayBCPGKey
{
    // 56 octets of the native public key
    public static final int LENGTH = 56;

    public X448PublicBCPGKey(BCPGInputStream in)
            throws IOException
    {
        super(LENGTH, in);
    }

    public X448PublicBCPGKey(byte[] key)
    {
        super(LENGTH, key);
    }
}
