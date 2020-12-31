package org.scalasteward.core.repoconfig

import cats.kernel.laws.discipline.SemigroupTests
import munit.DisciplineSuite
import org.scalasteward.core.TestInstances._

class CommitsConfigTest extends DisciplineSuite {
  checkAll("Semigroup[CommitsConfig]", SemigroupTests[CommitsConfig].semigroup)
}
