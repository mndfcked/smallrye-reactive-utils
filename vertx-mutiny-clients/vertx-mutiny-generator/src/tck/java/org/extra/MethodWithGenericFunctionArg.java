package org.extra;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.json.JsonObject;

import java.util.function.Function;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface MethodWithGenericFunctionArg<T> {
    MethodWithGenericFunctionArg<T> doSomething(Function<Generic1<JsonObject>, T> theFunction);
}
