package com.ulfric.allsystemsgo;

import org.junit.jupiter.api.Test;

import com.google.common.truth.Truth8;

class AllSystemsContractTest {

	@Test
	void testFileSystemProvider() {
		Truth8.assertThat(AllSystemsContract.fileSystemProvider())
			.hasSize(3);
	}

}
