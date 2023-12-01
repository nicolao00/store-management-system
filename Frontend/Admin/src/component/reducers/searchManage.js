const initialState = {
	url : "http://127.0.0.1:8000/quiz/",

	headquaurtersSearch : false,
	headName : "",
	headCategory : "",

    releaseSearch : false,
	releaseName : "",
	releaseCategory : "",
	releaseSupplier : "",

    warehousingSearch : false,
	wareName : "",
	wareAddr : "",

	storeSearch : false,
	storeName : "",
	storeAddr : "",

	employSearch : false,
	employName : "",
	employAddr : "",

}

export default function searchReducer(state = initialState, action) {
	switch (action.type) {
		case 'headquaurters': {
			return {
				...state,
				headName : action.payload.name,
				headCategory : action.payload.category,
				headquaurtersSearch : true
			}
		}
		case 'headquaurtersEnd': {
			return {
				...state,
				headName : "",
				headCategory : "",
				headquaurtersSearch : false
			}
		}
		case 'release': {
			return {
				...state,
				releaseName : action.payload.name,
				releaseCategory : action.payload.category,
				releaseSupplier : action.payload.supplier,
				releaseSearch : true
			}
		}
		case 'releaseEnd': {
			return {
				...state,
				releaseName : "",
				releaseCategory : "",
				releaseSupplier : "",
				releaseSearch : false
			}
		}
        case 'warehousing': {
			return {
				...state,
				wareName : action.payload.name,
				wareAddr : action.payload.addr,
				warehousingSearch : true
			}
		}
		case 'warehousingEnd': {
			return {
				...state,
				wareName : "",
				wareAddr : "",
				warehousingSearch : false
			}
		}
		case 'storemanage': {
			return {
				...state,
				storeName : action.payload.name,
				storeAddr : action.payload.addr,
				storeSearch : true
			}
		}
		case 'storemanageEnd': {
			return {
				...state,
				storeName : "",
				storeAddr : "",
				storeSearch : false
			}
		}case 'employee': {
			return {
				...state,
				employName : action.payload.name,
				employAddr : action.payload.addr,
				employSearch : true
			}
		}
		case 'employeeEnd': {
			return {
				...state,
				employName : "",
				employAddr : "",
				employSearch : false
			}
		}
		default:
			return state
	}
}