package de.agilecoders.wicket.logging;

import org.apache.wicket.util.time.Duration;

/**
 * A set of default values that are used on client side to handle
 * logging.
 *
 * @author miha
 */
public final class DefaultValues {

    public static final boolean replaceWicketLog = true;
    public static final boolean replaceWindowOnError = true;
    public static final boolean wrapWindowOnError = false;
    public static final boolean wrapWicketLog = false;
    public static final boolean flushMessagesOnUnload = true;
    public static final boolean logStacktrace = false;
    public static final boolean logAdditionalErrors = true;

    public static final int maxQueueSize = 10;
    public static final String loggerName = "Log";
    public static final long collectionTimer = Duration.seconds(5).getMilliseconds();
    public static final CollectionType collectionType = CollectionType.Single;
    public static final boolean collectClientInfos = true;

    public static final String defaultMessage = "NULL_MSG";
    public static final String defaultTimestamp = "NULL_TIMESTAMP";
    public static final String defaultClientInfoValue = "NULL";

    public static final String paramSplitter = "_";
    public static final char paramSplitterChar = paramSplitter.charAt(0);
}