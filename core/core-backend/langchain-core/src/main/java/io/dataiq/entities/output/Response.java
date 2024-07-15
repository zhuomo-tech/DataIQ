package io.dataiq.entities.output;

/**
 * [简要描述类用途]
 * <p>
 * [详细描述类用途、功能等，可选]
 * <p>
 * [额外的细节描述，比如类的组成、原理等，可选]
 *
 * @author xienng
 * @version 1.0
 * @date 2024年07月11日 18:18
 */

public class Response<T> {
    private final T content;
    private final TokenUsage tokenUsage;
    private final FinishReason finishReason;

    public Response(T content) {
        this.content = content;
        this.tokenUsage = null;
        this.finishReason = null;
    }

    public Response(T content, TokenUsage tokenUsage, FinishReason finishReason) {
        this.content = content;
        this.tokenUsage = tokenUsage;
        this.finishReason = finishReason;
    }
}
