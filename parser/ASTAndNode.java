/* Generated By:JJTree: Do not edit this line. ASTAndNode.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTAndNode extends SimpleNode {
  public ASTAndNode(int id) {
    super(id);
  }

  public ASTAndNode(PortugolParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PortugolParserVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f416ee71a109836c44aea9074abf2d2e (do not edit this line) */
