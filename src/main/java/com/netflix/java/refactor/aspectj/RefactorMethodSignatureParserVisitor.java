// Generated from /Users/joschneider/Projects/github/jkschneider/java-source-refactor/src/main/antlr4/RefactorMethodSignatureParser.g4 by ANTLR 4.2.2
package com.netflix.java.refactor.aspectj;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RefactorMethodSignatureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RefactorMethodSignatureParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(@NotNull RefactorMethodSignatureParser.MemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(@NotNull RefactorMethodSignatureParser.DefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(@NotNull RefactorMethodSignatureParser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull RefactorMethodSignatureParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(@NotNull RefactorMethodSignatureParser.AnnotationTypeBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(@NotNull RefactorMethodSignatureParser.GenericInterfaceMethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(@NotNull RefactorMethodSignatureParser.ClassBodyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#formalsPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalsPattern(@NotNull RefactorMethodSignatureParser.FormalsPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull RefactorMethodSignatureParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(@NotNull RefactorMethodSignatureParser.EnumBodyDeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(@NotNull RefactorMethodSignatureParser.ForUpdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#optionalParensTypePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParensTypePattern(@NotNull RefactorMethodSignatureParser.OptionalParensTypePatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(@NotNull RefactorMethodSignatureParser.EnhancedForControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(@NotNull RefactorMethodSignatureParser.AnnotationConstantRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(@NotNull RefactorMethodSignatureParser.ExplicitGenericInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(@NotNull RefactorMethodSignatureParser.NonWildcardTypeArgumentsOrDiamondContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull RefactorMethodSignatureParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#formalParametersPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParametersPattern(@NotNull RefactorMethodSignatureParser.FormalParametersPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(@NotNull RefactorMethodSignatureParser.AnnotationTypeElementRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(@NotNull RefactorMethodSignatureParser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(@NotNull RefactorMethodSignatureParser.TypeBoundContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(@NotNull RefactorMethodSignatureParser.VariableDeclaratorIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull RefactorMethodSignatureParser.PrimaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(@NotNull RefactorMethodSignatureParser.ClassCreatorRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(@NotNull RefactorMethodSignatureParser.InterfaceBodyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull RefactorMethodSignatureParser.TypeArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(@NotNull RefactorMethodSignatureParser.AnnotationNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(@NotNull RefactorMethodSignatureParser.FinallyBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull RefactorMethodSignatureParser.TypeParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(@NotNull RefactorMethodSignatureParser.LastFormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(@NotNull RefactorMethodSignatureParser.ConstructorBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull RefactorMethodSignatureParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(@NotNull RefactorMethodSignatureParser.AnnotationMethodOrConstantRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(@NotNull RefactorMethodSignatureParser.CatchClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(@NotNull RefactorMethodSignatureParser.VariableDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull RefactorMethodSignatureParser.TypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(@NotNull RefactorMethodSignatureParser.EnumConstantsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull RefactorMethodSignatureParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(@NotNull RefactorMethodSignatureParser.CreatedNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#targetTypePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetTypePattern(@NotNull RefactorMethodSignatureParser.TargetTypePatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(@NotNull RefactorMethodSignatureParser.EnumDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull RefactorMethodSignatureParser.FormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull RefactorMethodSignatureParser.ParExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull RefactorMethodSignatureParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(@NotNull RefactorMethodSignatureParser.VariableInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(@NotNull RefactorMethodSignatureParser.ElementValueArrayInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(@NotNull RefactorMethodSignatureParser.CreatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(@NotNull RefactorMethodSignatureParser.ArrayCreatorRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull RefactorMethodSignatureParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull RefactorMethodSignatureParser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#methodPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodPattern(@NotNull RefactorMethodSignatureParser.MethodPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(@NotNull RefactorMethodSignatureParser.QualifiedNameListContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(@NotNull RefactorMethodSignatureParser.ConstructorDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(@NotNull RefactorMethodSignatureParser.ForControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(@NotNull RefactorMethodSignatureParser.SuperSuffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#classNameOrInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassNameOrInterface(@NotNull RefactorMethodSignatureParser.ClassNameOrInterfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(@NotNull RefactorMethodSignatureParser.VariableDeclaratorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(@NotNull RefactorMethodSignatureParser.CatchTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#formalsPatternAfterDotDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalsPatternAfterDotDot(@NotNull RefactorMethodSignatureParser.FormalsPatternAfterDotDotContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(@NotNull RefactorMethodSignatureParser.ClassOrInterfaceModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(@NotNull RefactorMethodSignatureParser.EnumConstantNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(@NotNull RefactorMethodSignatureParser.ModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(@NotNull RefactorMethodSignatureParser.InnerCreatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(@NotNull RefactorMethodSignatureParser.ExplicitGenericInvocationSuffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(@NotNull RefactorMethodSignatureParser.VariableModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(@NotNull RefactorMethodSignatureParser.ElementValuePairContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(@NotNull RefactorMethodSignatureParser.ArrayInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(@NotNull RefactorMethodSignatureParser.ElementValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(@NotNull RefactorMethodSignatureParser.ConstDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(@NotNull RefactorMethodSignatureParser.ResourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull RefactorMethodSignatureParser.QualifiedNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(@NotNull RefactorMethodSignatureParser.ResourceSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull RefactorMethodSignatureParser.FormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(@NotNull RefactorMethodSignatureParser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull RefactorMethodSignatureParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#dotDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotDot(@NotNull RefactorMethodSignatureParser.DotDotContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(@NotNull RefactorMethodSignatureParser.AnnotationMethodRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(@NotNull RefactorMethodSignatureParser.SwitchBlockStatementGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull RefactorMethodSignatureParser.TypeParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(@NotNull RefactorMethodSignatureParser.InterfaceBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull RefactorMethodSignatureParser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull RefactorMethodSignatureParser.MethodBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#formalTypePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalTypePattern(@NotNull RefactorMethodSignatureParser.FormalTypePatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(@NotNull RefactorMethodSignatureParser.TypeArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull RefactorMethodSignatureParser.TypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(@NotNull RefactorMethodSignatureParser.GenericConstructorDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull RefactorMethodSignatureParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(@NotNull RefactorMethodSignatureParser.EnumConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull RefactorMethodSignatureParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull RefactorMethodSignatureParser.ImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull RefactorMethodSignatureParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(@NotNull RefactorMethodSignatureParser.InterfaceDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(@NotNull RefactorMethodSignatureParser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull RefactorMethodSignatureParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull RefactorMethodSignatureParser.FieldDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(@NotNull RefactorMethodSignatureParser.ConstantDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(@NotNull RefactorMethodSignatureParser.ResourcesContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(@NotNull RefactorMethodSignatureParser.StatementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(@NotNull RefactorMethodSignatureParser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#simpleNamePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleNamePattern(@NotNull RefactorMethodSignatureParser.SimpleNamePatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull RefactorMethodSignatureParser.PackageDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(@NotNull RefactorMethodSignatureParser.ElementValuePairsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(@NotNull RefactorMethodSignatureParser.LocalVariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(@NotNull RefactorMethodSignatureParser.NonWildcardTypeArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(@NotNull RefactorMethodSignatureParser.InterfaceMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(@NotNull RefactorMethodSignatureParser.SwitchLabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(@NotNull RefactorMethodSignatureParser.ForInitContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(@NotNull RefactorMethodSignatureParser.FormalParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull RefactorMethodSignatureParser.ArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(@NotNull RefactorMethodSignatureParser.GenericMethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RefactorMethodSignatureParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(@NotNull RefactorMethodSignatureParser.TypeArgumentsOrDiamondContext ctx);
}