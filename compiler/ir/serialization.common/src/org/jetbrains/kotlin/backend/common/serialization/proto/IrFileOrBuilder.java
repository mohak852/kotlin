// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrFile)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.UniqId declaration_id = 1;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.UniqId> 
      getDeclarationIdList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.UniqId declaration_id = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.UniqId getDeclarationId(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.UniqId declaration_id = 1;</code>
   */
  int getDeclarationIdCount();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry file_entry = 2;</code>
   */
  boolean hasFileEntry();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry file_entry = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry getFileEntry();

  /**
   * <code>repeated int32 fq_name = 3;</code>
   */
  java.util.List<java.lang.Integer> getFqNameList();
  /**
   * <code>repeated int32 fq_name = 3;</code>
   */
  int getFqNameCount();
  /**
   * <code>repeated int32 fq_name = 3;</code>
   */
  int getFqName(int index);

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall> 
      getAnnotationList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall getAnnotation(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  int getAnnotationCount();

  /**
   * <code>repeated int32 explicitly_exported_to_compiler = 5;</code>
   */
  java.util.List<java.lang.Integer> getExplicitlyExportedToCompilerList();
  /**
   * <code>repeated int32 explicitly_exported_to_compiler = 5;</code>
   */
  int getExplicitlyExportedToCompilerCount();
  /**
   * <code>repeated int32 explicitly_exported_to_compiler = 5;</code>
   */
  int getExplicitlyExportedToCompiler(int index);
}