package org.wecancodeit.Reviewsitefullstack;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Object findById(Long id);

	
}
