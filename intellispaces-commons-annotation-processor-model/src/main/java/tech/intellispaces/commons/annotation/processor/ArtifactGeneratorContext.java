package tech.intellispaces.commons.annotation.processor;

import javax.annotation.processing.RoundEnvironment;
import java.lang.annotation.Annotation;

public interface ArtifactGeneratorContext {

  RoundEnvironment initialRoundEnvironment();

  RoundEnvironment activeRoundEnvironment();

  boolean isProcessingFinished(String sourceArtifactName, Class<? extends Annotation> annotation);

  boolean isGenerated(String generatedArtifactName);
}
