
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/helloWorld/conf/routes
// @DATE:Mon Feb 12 16:30:04 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
