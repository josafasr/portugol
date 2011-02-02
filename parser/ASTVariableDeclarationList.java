/* Generated By:JJTree: Do not edit this line. ASTVariableDeclarationList.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTVariableDeclarationList extends SimpleNode {

  private Token type_quali = new Token(PortugolParserConstants.VARIABLE, PortugolParserConstants.tokenImage[ PortugolParserConstants.VARIABLE ] );
  private Token type_spec = null;
	
  public ASTVariableDeclarationList(int id) {
    super(id);
  }

  public ASTVariableDeclarationList(PortugolParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PortugolParserVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
  
  public  void setTypeQualifier(Token type_quali)
  {
	this.type_quali = type_quali;
  }
  
  public void setTypeSpecifier(Token type_spec)
  {
	this.type_spec = type_spec;
	//if( this.type_quali == null )
	//{
	//	this.type_quali = new Token(PortugolParserConstants.VARIABLE, PortugolParserConstants.tokenImage[PortugolParserConstants.VARIABLE] );
	//}	
  }
  
  //------
  
  public String getTypeQualifier()
  {
	return type_quali.image;
  }
  
  public String getTypeSpecifier()
  {
	return type_spec.image;
  }
  
  //-----
  
  public Token getTokenTypeQualifier()
  {
	return type_quali;
  }
  
  public Token getTokenTypeSpecifier()
  {
	return type_spec;
  }
  
}
/* JavaCC - OriginalChecksum=aa6b6e402090baa98d9f5daedc30fe63 (do not edit this line) */
