/* Generated By:JJTree: Do not edit this line. ASTAddNode.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTAddNode extends SimpleNode {
  public ASTAddNode(int id) {
    super(id);
  }

  public ASTAddNode(PortugolParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PortugolParserVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bce2e73bc695efe9f38e80b539c01b21 (do not edit this line) */
