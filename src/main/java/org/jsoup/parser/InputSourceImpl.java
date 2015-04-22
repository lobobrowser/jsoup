package org.jsoup.parser;

import java.io.InputStream;
import java.io.Reader;
import org.xml.sax.InputSource;

/**
 * The <code>InputSourceImpl</code> class implements the
 * <code>InputSource</code> interface.
 *
 * @project Lobo Browser Cobra Engine
 */
 
 public class InputSourceImpl extends InputSource {

  /**
   * Constructs an <code>InputSourceImpl</code>.
   *
   * @deprecated Use a constructor that takes either a stream or a reader.
   */
  @Deprecated
  public InputSourceImpl() {
    super();
  }

  /**
   * Constructs an <code>InputSourceImpl</code>.
   * <p>
   * It is valid to use this constructor, but it is generally recommended that
   * callers use one of the constructors that take a reader or an input stream
   * instead.
   *
   * @param uri
   *  The URI (or systemID) of the document.
   */
  public InputSourceImpl(final String uri) {
    super(uri);
  }

  /**
   * Constructs an <code>InputSourceImpl</code>.
   *
   * @param byteStream
   * The input stream where content can be read.
   * @deprecated Use constructor with <code>uri</code> parameter.
   */
  @Deprecated
  public InputSourceImpl(final InputStream byteStream) {
    super(byteStream);
  }

  /**
   * Constructs an <code>InputSourceImpl</code>.
   *
   * @param characterStream
   *          The <code>Reader</code> where characters can be read.
   * @deprecated Use constructor with <code>uri</code> parameter.
   */
  @Deprecated
  public InputSourceImpl(final Reader characterStream) {
    super(characterStream);
  }

  /**
   * Constructs an <code>InputSourceImpl</code>.
   *
   * @param characterStream
   *          The <code>Reader</code> where characters can be read.
   * @param uri
   *          The URI of the document.
   */
  public InputSourceImpl(final Reader characterStream, final String uri) {
    super(characterStream);
    this.setSystemId(uri);
  }

  /**
   * Constructs an <code>InputSourceImpl</code>.
   *
   * @param byteStream
   *  The input stream where content can be read.
   * @param uri
   *  The URI that identifies the content.
   * @param charset
   * The character set of the input stream.
   */
  public InputSourceImpl(final InputStream byteStream, final String uri, final String charset) {
    super(byteStream);
    this.setEncoding(charset);
    this.setSystemId(uri);
    this.setPublicId(uri);
  }
}
