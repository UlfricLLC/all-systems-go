package com.ulfric.allsystemsgo;

import org.junit.jupiter.api.Test;

import com.google.common.truth.Truth8;

class AllSystemsArgumentsProviderTest {

	@Test
	void testFileSystemProvider() {
		Truth8.assertThat(new AllSystemsArgumentsProvider().provideArguments(null))
			.hasSize(3);
	}

}
