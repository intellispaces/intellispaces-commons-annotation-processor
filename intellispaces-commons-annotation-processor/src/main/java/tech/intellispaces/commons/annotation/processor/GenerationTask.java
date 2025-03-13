package tech.intellispaces.commons.annotation.processor;

import tech.intellispaces.commons.reflection.customtype.CustomType;

import java.lang.annotation.Annotation;

/**
 * The task to generate new artifact.
 *
 * @param source the source artifact related to this task.
 * @param annotation the annotation of the source artifact related to this task.
 * @param generator the generator that needs to be run.
 * @param context the generator context.
 */
record GenerationTask(
    CustomType source,
    Class<? extends Annotation> annotation,
    ArtifactGenerator generator,
    ArtifactGeneratorContext context
) {
}
