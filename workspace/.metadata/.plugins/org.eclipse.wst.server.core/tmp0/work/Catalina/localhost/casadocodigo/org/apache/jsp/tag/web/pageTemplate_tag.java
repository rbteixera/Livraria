/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2019-03-26 11:58:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pageTemplate_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("s:mvcUrl", org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.class, "fromMappingName", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/Cabecalho.jsp", Long.valueOf(1528323299000L));
    _jspx_dependants.put("/WEB-INF/views/Rodape.jsp", Long.valueOf(1528295029000L));
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String titulo;
  private java.lang.String bodyClass;

  public java.lang.String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(java.lang.String titulo) {
    this.titulo = titulo;
    jspContext.setAttribute("titulo", titulo);
  }

  public java.lang.String getBodyClass() {
    return this.bodyClass;
  }

  public void setBodyClass(java.lang.String bodyClass) {
    this.bodyClass = bodyClass;
    jspContext.setAttribute("bodyClass", bodyClass);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getTitulo() != null ) 
      _jspx_page_context.setAttribute("titulo", getTitulo());
    if( getBodyClass() != null ) 
      _jspx_page_context.setAttribute("bodyClass", getBodyClass());

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("<link rel=\"icon\" href=\"//cdn.shopify.com/s/files/1/0155/7645/t/177/assets/favicon.ico?11981592617154272979\" type=\"image/ico\" />\n");
      out.write("<link href=\"https://plus.googlecom/108540024862647200608\" rel=\"publisher\" />\n");
      out.write("<!--  <title>Livros de Java, SOA, Android, iPhone, Ruby on Rails e muito mais - Casa do Código</title> -->\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.titulo}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write(" - Casa do Código</title>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/cssbase-min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/fonts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/fontello-ie7.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/fontello-embedded.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/fontello.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/layout-colors.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/responsive-style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/guia-do-programador-style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/produtos.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"canonical\" href=\"http://www.casadocodigo.com.br/\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/book-collection.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bodyClass}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<header id=\"layout-header\">\n");
      out.write("\t\t<div class=\"clearfix container\">\n");
      out.write("\t\t\t<a href=\"/casadocodigo/\" id=\"logo\"> </a>\n");
      out.write("\t\t\t<div id=\"header-content\">\n");
      out.write("\t\t\t\t<nav id=\"main-nav\">\n");
      out.write("\t\t\t\t\t<ul class=\"clearfix\">\n");
      out.write("\t\t\t\t   ");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:mvcUrl('CCC#itens').build() }", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0, false));
      out.write("\" rel=\"nofollow\">Carrinho (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${carrinhoCompras.quantidade }", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write(")</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/pages/sobre-a-casa-do-codigo\" rel=\"nofollow\">Sobre Nós</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/pages/perguntas-frequentes\" rel=\"nofollow\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<nav class=\"categories-nav\">\n");
      out.write("\t\t<ul class=\"container\">\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/casadocodigo/\">Home</a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-agile\"> Agile </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-front-end\"> Front End </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-games\"> Games </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-java\"> Java </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-mobile\"> Mobile </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-desenvolvimento-web\"> Web </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/outros\"> Outros </a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</nav>\n");
      out.write('\n');
      out.write('\n');
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,getJspContext());
      out.write('\n');
      out.write('\n');
      out.write("\t<footer id=\"layout-footer\">\n");
      out.write("\t\t<div class=\"clearfix container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"collections-footer\">\n");
      out.write("\t\t\t\t<!-- cdc-footer -->\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Coleções de Programação</p>\n");
      out.write("\t\t\t\t<ul class=\"footer-text-links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-java\">Java</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-desenvolvimento-web\">Desenvolvimento\n");
      out.write("\t\t\t\t\t\t\tWeb</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-mobile\">Mobile</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/games\">Games</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-front-end\">Front End</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Outros Assuntos</p>\n");
      out.write("\t\t\t\t<ul class=\"footer-text-links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-agile\">Agile</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/outros\">e outros...</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"social-footer\">\n");
      out.write("\t\t\t\t<!-- books-footer -->\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Links da Casa do Código</p>\n");
      out.write("\t\t\t\t<ul class=\"footer-text-links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"http://livros.casadocodigo.com.br\" rel=\"nofollow\">Meus\n");
      out.write("\t\t\t\t\t\t\tE-books</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/pages/sobre-a-casa-do-codigo\">Sobre a Casa\n");
      out.write("\t\t\t\t\t\t\tdo Código</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/pages/perguntas-frequentes\">Perguntas\n");
      out.write("\t\t\t\t\t\t\tFrequentes</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"https://www.caelum.com.br\">Caelum - Ensino e\n");
      out.write("\t\t\t\t\t\t\tInovação</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.codecrushing.com/\" rel=\"nofollow\">Code\n");
      out.write("\t\t\t\t\t\t\tCrushing</a></li>\n");
      out.write("\t\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\t\thref=\"http://www.casadocodigo.com.br/pages/politica-de-privacidade\"\n");
      out.write("\t\t\t\t\t\trel=\"nofollow\">Política de Privacidade</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Redes Sociais</p>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"social-links\"><a\n");
      out.write("\t\t\t\t\t\thref=\"http://www.twitter.com/casadocodigo\" target=\"_blank\"\n");
      out.write("\t\t\t\t\t\tid=\"twitter\" rel=\"nofollow\">Facebook</a> <a\n");
      out.write("\t\t\t\t\t\thref=\"http://www.facebook.com/casadocodigo\" target=\"_blank\"\n");
      out.write("\t\t\t\t\t\tid=\"facebook\" rel=\"nofollow\">Twitter</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"newsletter-footer\">\n");
      out.write("\t\t\t\t<!-- social-footer -->\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Receba as Novidades e Lançamentos</p>\n");
      out.write("\t\t\t\t<div id=\"form-newsletter\">\n");
      out.write("\t\t\t\t\t<form\n");
      out.write("\t\t\t\t\t\taction=\"\"\n");
      out.write("\t\t\t\t\t\tmethod=\"POST\" id=\"ss-form\" class=\"form-newsletter\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><input type=\"hidden\" name=\"pageNumber\" value=\"0\"/><input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" name=\"backupCache\" value=\"\"/><input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"email\" name=\"entry.0.single\" value=\"\" class=\"ss-q-short\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"entry_0\" placeholder=\"seu@email.com\"/></li>\n");
      out.write("\t\t\t\t\t\t\t<li><input type=\"submit\" name=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"Quero Receber!\" id=\"submit-newsletter\"/></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"ie8\"><a\n");
      out.write("\t\t\t\t\t\t\thref=\"\"\n");
      out.write("\t\t\t\t\t\t\trel=\"nofollow\">Receba as Novidades e Lançamentos</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<ul class=\"footer-payments\">\n");
      out.write("\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/pageTemplate.tag(13,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/resources/css");
      // /WEB-INF/tags/pageTemplate.tag(13,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("contextPath");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_security_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/views/Cabecalho.jsp(9,7) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f0.setAccess("hasRole('ROLE_ADMIN')");
      int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:mvcUrl('PC#listar').build() }", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0, false));
        out.write("\" rel=\"nofollow\">Lista de Produtos</a></li>\n");
        out.write("\t\t\t\t\t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:mvcUrl('PC#form').build() }", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0, false));
        out.write("\" rel=\"nofollow\">Cadastro de Produtos</a></li>\t\t\n");
        out.write("\t\t\t\t\t");
      }
      if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
      _jspx_th_security_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_security_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_security_005fauthorize_005f0_reused);
    }
    return false;
  }
}